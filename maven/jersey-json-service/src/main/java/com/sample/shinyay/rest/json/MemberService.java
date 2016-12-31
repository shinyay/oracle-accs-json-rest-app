package com.sample.shinyay.rest.json;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

/**
 * Created by syanagih on 2016/12/31.
 */
@Path("/members")
public class MemberService {

    private final CopyOnWriteArrayList<Member> mList = MockMemberList.getInstance();

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Member[] getAllMembers() {
        return mList.toArray(new Member[0]);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Member getMember(@PathParam("id") long id) {
        Optional<Member> match = mList.stream()
                .filter(c -> c.getId() == id)
                .findFirst();
        if (match.isPresent()) {
            return match.get();
        } else {
            throw new NotFoundException(new JsonError("Error", "Member " + id + " not found"));
        }
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addMember(Member member) {
        mList.add(member);
        return Response.status(201).build();
    }

    @PUT
    @Path("{id}/update")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateMember(Member member) {
        int matchIdx = 0;
        Optional<Member> match = mList.stream()
                .filter(c -> c.getId() == member.getId())
                .findFirst();
        if (match.isPresent()) {
            matchIdx = mList.indexOf(match.get());
            mList.set(matchIdx, member);
            return Response.status(Response.Status.OK).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/remove/{id}")
    public Response deleteMember(@PathParam("id") long id) {
        Predicate<Member> member = c -> c.getId() == id;
        if (mList.removeIf(member)) {
            return Response.status(Response.Status.OK).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}

package in.raj.service;

import in.raj.model.RoomMate;

import java.util.List;

public interface IRoomMateService {
    public List<RoomMate> fetchAllRoomMateNos();
    public String registerRoomMate(RoomMate roomMate);
    public RoomMate getRoomMate(String roomMateNo);
}

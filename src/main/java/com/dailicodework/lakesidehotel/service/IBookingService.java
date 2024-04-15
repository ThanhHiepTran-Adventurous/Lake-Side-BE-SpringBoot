package com.dailicodework.lakesidehotel.service;

import com.dailicodework.lakesidehotel.model.BookedRoom;

import java.util.List;

public interface IBookingService {
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);
}

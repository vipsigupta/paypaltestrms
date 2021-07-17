package com.paypal.test.rms.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.paypal.test.rms.config.SeatType;
import com.paypal.test.rms.config.TrainType;
import com.paypal.test.rms.dto.BookingInfo;
import com.paypal.test.rms.entities.ACCoach;
import com.paypal.test.rms.entities.ChairCar;
import com.paypal.test.rms.entities.Coach;
import com.paypal.test.rms.entities.Destination;
import com.paypal.test.rms.entities.Schedule;
import com.paypal.test.rms.entities.Train;
import com.paypal.test.rms.entities.TrainLayout;
import com.paypal.test.rms.entities.TrainSeatReservation;

@Repository
public class TrainRepo {
    static public List<Schedule> trains = new ArrayList<Schedule>();
    
    @PostConstruct
    public void init() {
        Train train = new Train();
        Destination source = new Destination();
        source.setId(1);
        source.setName("Delhi");
        source.setShortName("DL");
        Destination dest = new Destination();
        dest.setId(2);
        dest.setName("Banglore");
        dest.setShortName("BL");
        
        train.setSource(source);
        train.setDestination(dest);
        train.setId(123);
        train.setType(TrainType.SUPERFAST);
        
        TrainLayout trainLayput = new ChairCar();
        
        TrainSeatReservation trainSeatReservatin = new TrainSeatReservation();
        trainSeatReservatin.setSeatId(789);
        trainSeatReservatin.setSeat(SeatType.CHAIR);
        List<TrainSeatReservation> seats = new ArrayList<TrainSeatReservation>();
        seats.add(trainSeatReservatin);
        
        Coach coach  = new ACCoach();
        coach.setId(456);
        coach.setSeats(seats);
        List<Coach> coaches = new ArrayList<Coach>();
        coaches.add(coach);
        
        trainLayput.setCoaches(coaches);
        
        train.setLayout(trainLayput);
        
        Schedule schedule = new Schedule();
        schedule.setDate("17-07-2021");
        schedule.setTrain(train);
        trains.add(schedule);
        
    }
    
    public Train getTrain(String source,String des,String date) {
        //iteration on Schedule based on date
        for(Schedule schedule : trains) {
            if(schedule.getDate().equals(date)) {
                return schedule.getTrain();
            }
        }
        return null;
    }
    
    public BookingInfo bookTrain(Train train) {
        BookingInfo bookingInfo = new BookingInfo();
        bookingInfo.setCoachId(456);
        bookingInfo.setSeatId(789);
        bookingInfo.setTrainId(123);
        return bookingInfo;
    }
}

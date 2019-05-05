import { Component, OnInit } from '@angular/core';
import { Meeting } from '../meeting.model';
import { MeetingRoom } from '../meeting-room.model';

@Component({
  selector: 'app-meeting-list',
  templateUrl: './meeting-list.component.html',
  styleUrls: ['./meeting-list.component.css']
})
export class MeetingListComponent implements OnInit {
  private meetings = [
    new Meeting('Daily standup', '08:30'),
    new Meeting('Retrospective', '16:30'),
    new Meeting('Project kickoff', '12:30')
  ];

  private meetingRooms = [
    new MeetingRoom('Tárgyaló'),
    new MeetingRoom('Kitchen')
  ];

  constructor() { }

  ngOnInit() {
  }

}

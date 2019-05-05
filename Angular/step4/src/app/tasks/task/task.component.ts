import { Component, OnInit, Input, EventEmitter, Output, Inject, Injectable } from '@angular/core';
import { LogServiceService } from '../../log-service.service';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';



@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {

  @Output()
  hundredReached = new EventEmitter<String>();

  statusNum: number = 0;

  @Input('firstName')
  name: string;

  @Input()
  lastName: string;

  @Input()
  checkboxValue: boolean;

  // log: LogServiceService;
  constructor(private log: LogServiceService) { 
    // this.log = log;
   }

  onClick() {
    this.statusNum += 10;
    if (this.statusNum >= 100) {
      this.hundredReached.next(this.name);
    }
  }
  
  ngOnInit() {
    this.log.log(this.name);

  }

}

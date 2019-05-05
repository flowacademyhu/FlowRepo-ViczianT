import { Component, OnInit, Directive } from '@angular/core';
import { NgModel } from '@angular/forms';
import { TaskServiceService} from '../../task-service.service';
import { LogServiceService } from '../../log-service.service';


@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {

  tasks: string[] = ['cook', 'learn Angular', 'practise JAVA', 'watch GoT', 'beat Feri in Codewars', 'bla-blabla'];

  public checkboxMark: boolean = false;

  handleHundredReached(data: string) { alert(data); }

  constructor(private taskService: TaskServiceService, private logService: LogServiceService) {}

  num1: number = 3;

  ngOnInit() {
    this.taskService.getAll(this.num1).subscribe(
      (result) => {
        this.logService.log(result.toString());
      }
    );

  }
}

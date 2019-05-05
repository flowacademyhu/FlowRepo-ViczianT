import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import { Task } from '../task.model';
import { ActivatedRoute, Params, Router } from '@angular/router';

@Component({
  selector: 'app-task-edit',
  templateUrl: './task-edit.component.html',
  styleUrls: ['./task-edit.component.css']
})
export class TaskEditComponent implements OnInit {

  model: Task;

  constructor(private taskService: TaskService, private route: ActivatedRoute, private router: Router) {
  }

  onClick() {
    this.router.navigate(['tasks']);
  }
  submitted() {
    this.taskService.save(this.model);
    this.router.navigate(['tasks']);
  }
  ngOnInit() {

    this.route.params.subscribe((params: Params) => {
      this.model = this.taskService.get(params.id);
      console.log(this.model.id);
    });
  }

}

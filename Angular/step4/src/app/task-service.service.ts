import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { take, first } from 'rxjs/operators';


@Injectable()
export class TaskServiceService {

  getAll(num1: number) {
    console.log("spmgdk");
    console.log(num1);
    return this.http.get('https://jsonplaceholder.typicode.com/todos').pipe(
      first()
    );
  }

  constructor(private http: HttpClient) {}

}

import { Injectable } from '@angular/core';


@Injectable()
export class LogServiceService {

  log(message: string) {
    console.log(message);
  }

}

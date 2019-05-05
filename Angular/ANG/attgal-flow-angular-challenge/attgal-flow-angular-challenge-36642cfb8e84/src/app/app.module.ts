import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MeetingListComponent } from './meetings/meeting-list/meeting-list.component';
import { MeetingComponent } from './meetings/meeting/meeting.component';
import { LoggerService } from './logger.service';

@NgModule({
  declarations: [
    AppComponent,
    MeetingListComponent,
    MeetingComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [LoggerService],
  bootstrap: [AppComponent]
})
export class AppModule { }

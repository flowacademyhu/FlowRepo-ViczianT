import { Component, OnInit, Input } from '@angular/core';
import { Book } from '../book.model';
import { LoggerService } from 'src/app/logger.service';
import { BookService } from '../book.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
  @Input()
  model: Book;
  constructor(private loggerService: LoggerService) { }

  ngOnInit() {
    this.loggerService.log(this.model.title.toString());
    this.loggerService.log(this.model.title); //toString nélkül -kellene- mennie, mert a title string - log mehod stringet vár.
  }
}

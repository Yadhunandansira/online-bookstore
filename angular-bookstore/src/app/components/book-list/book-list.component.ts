import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/common/book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books:Book[] = [
    {
      sku: "text-100",
      name: "C Programming Language",
      description: "Learn C Programming Language",
      unitPrice: 600,
      imageUrl: "assets/images/books/text-100.png",
      active: true,
      unitsInStock: 100,
      createdOn: new Date(),
      updatedOn: null,
    },
    {
      sku: "text-101",
      name: "C# Crash Course",
      description: "Learn C# Programming Language",
      unitPrice: 900,
      imageUrl: "assets/images/books/text-101.png",
      active: true,
      unitsInStock: 100,
      createdOn: new Date(),
      updatedOn: null,
    },
    {
      sku: "text-102",
      name: "C++ Crash Course",
      description: "Learn C++ Programming Language",
      unitPrice: 700,
      imageUrl: "assets/images/books/text-102.png",
      active: true,
      unitsInStock: 100,
      createdOn: new Date(),
      updatedOn: null,
    }
  ];
  constructor(private _bookService:BookService) { }

  ngOnInit(): void {
    this.fnGetListBooks();
  }

  fnGetListBooks(){
    this._bookService.fnGetBooks().subscribe((response)=>{
      console.log(response);
      this.books = response;
    });
  }
}

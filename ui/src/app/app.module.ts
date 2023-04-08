import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule  } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BooksComponent } from './books/books.component';
import { LoansComponent } from './loans/loans.component';
import { StudentsComponent } from './students/students.component';
import { AuthorsComponent } from './authors/authors.component';
import { PublishersComponent } from './publishers/publishers.component';
import { AdminsComponent } from './admins/admins.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { AddBooksComponent } from './add-books/add-books.component';
import { AddAuthorsComponent } from './add-authors/add-authors.component';
import { AddPublishersComponent } from './add-publishers/add-publishers.component';
import { AddStudentsComponent } from './add-students/add-students.component';
import {HttpClientJsonpModule, HttpClientModule} from '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    BooksComponent,
    LoansComponent,
    StudentsComponent,
    AuthorsComponent,
    PublishersComponent,
    AdminsComponent,
    SidenavComponent,
    AddBooksComponent,
    AddAuthorsComponent,
    AddPublishersComponent,
    AddStudentsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, 
    ReactiveFormsModule,
    HttpClientJsonpModule,
    HttpClientModule
  ],
  providers: [], 
  bootstrap: [AppComponent]
})
export class AppModule { }

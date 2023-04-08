import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BooksComponent } from './books/books.component';
import { AuthorsComponent } from './authors/authors.component';
import { StudentsComponent } from './students/students.component';
import { AdminsComponent } from './admins/admins.component';
import { PublishersComponent } from './publishers/publishers.component';
import { LoansComponent } from './loans/loans.component';
import { AddBooksComponent } from './add-books/add-books.component';
import { AddStudentsComponent } from './add-students/add-students.component';
import { AddAuthorsComponent } from './add-authors/add-authors.component';
import { AddPublishersComponent } from './add-publishers/add-publishers.component';
const routes: Routes = [
   {
     path: "book",
     component: BooksComponent,
   },
   {
    path: "author",
    component: AuthorsComponent,
   },
   {
      path: "student",
      component: StudentsComponent,
   },
   {
    path: "admin",
    component: AdminsComponent,
   },
   {
    path: "publisher",
    component: PublishersComponent,
  },
  {
    path: "loan",
    component: LoansComponent,
  },
  {
    path: "add-books",
    component: AddBooksComponent,
  },
  {
    path: "add-students",
    component: AddStudentsComponent,
  },
  {
    path: "add-authors",
    component: AddAuthorsComponent,
  },
  {
    path: "add-publishers",
    component: AddPublishersComponent,
  },


];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }




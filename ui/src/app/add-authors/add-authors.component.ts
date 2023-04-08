import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-authors',
  templateUrl: './add-authors.component.html',
  styleUrls: ['./add-authors.component.css']
})
export class AddAuthorsComponent implements OnInit {
  authorsForm : FormGroup;
  


  constructor(private formBuilder: FormBuilder, private http: HttpClient, private router: Router) { 
    this.authorsForm = this.formBuilder.group({
   //id:['',Validators.required],
   birthDate:[''],
   name:['',Validators.required],
   nationality:[''],
    

  }
  );

  }

  ngOnInit(): void {
  }
  saveAuthor(){
    //Make Post Call to Request URL http://localhost:8081/books/saveBook
    let authorData = this.authorsForm.value;
    //Handle date to string
    this.http.post('http://localhost:8080/Authors/saveAuthor',authorData)
    .subscribe(response => {
      console.log('Author saved to DB', response)
      this.router.navigateByUrl('/author')
    }, 
     error =>{
       console.error("Error in author save",error)
    }
    );
  }
}

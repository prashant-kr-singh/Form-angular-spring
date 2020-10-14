import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormArray, Validators, FormBuilder } from "@angular/forms";
import { Router } from '@angular/router';

import { User } from '../models/user';
import { UserService } from '../user/user.service';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  multiForm: FormGroup;
  currentStep = 1;
  user: User;

  constructor(private router: Router, private userService: UserService) {
    this.user = new User();
  }

  ngOnInit() {

    this.multiForm = new FormGroup({
      firstName: new FormControl(''),
      lastName: new FormControl(''),
      sopraEmail: new FormControl(''),
      contactNumber: new FormControl(''),
      interests: new FormControl(''),
      joiningDate: new FormControl(''),
    })
  }

  next(e: Event) {
    e.preventDefault();
    if(this.currentStep === 1)
      this.currentStep += 1;
    else if(this.currentStep === 2) {
      this.userService.addUser(this.multiForm.getRawValue()).subscribe(
        result => alert("User Added."));
        this.router.navigate(['users/']);
    }
  }
}

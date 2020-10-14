import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user';
import { UserService } from '../user/user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})

export class AddUserComponent {

  user: User;

  constructor(private router: Router, private userService: UserService) {
    this.user = new User();
   }

   addUser():void {
     this.userService.addUser(this.user).subscribe(
        result => alert("User Added.")
     );
   }

}

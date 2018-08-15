import { Component, OnInit } from '@angular/core';
import { ChatterService } from '../chatter.service';
import { Res } from '../res';
 
@Component({
  selector: 'app-chatter',
  templateUrl: './chatter.component.html',
  styleUrls: ['./chatter.component.css']
})
export class ChatterComponent implements OnInit {

  name: string = 'Chatter var';
  firstname: string = 'yes';
  result: Res = {
    id: 1,
    content: "test"
  };

  constructor(private chatterService: ChatterService) {

   }

  getResult(): void {
    this.chatterService.getResult()
      .subscribe((data: Res) => {
          this.result = data;
          console.log(this.result);
      });
  }

  save(): void {
    console.log("test");
  }

  ngOnInit() {
    this.getResult();
  }

}

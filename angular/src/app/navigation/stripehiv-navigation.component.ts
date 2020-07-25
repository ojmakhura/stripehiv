import { Component, OnInit, Output, EventEmitter  } from '@angular/core';

@Component({
  selector: 'stripehiv-navigation',
  templateUrl: './stripehiv-navigation.component.html',
  styleUrls: ['./stripehiv-navigation.component.css']
})
export class StripehivNavigationComponent implements OnInit {
    @Output() public sidenavToggle = new EventEmitter();
    constructor() { }

    ngOnInit() {

    }

    public onSidenavClose = () => {
        this.sidenavToggle.emit();
    }

}
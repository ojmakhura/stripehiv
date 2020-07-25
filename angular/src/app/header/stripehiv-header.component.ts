import { Component, OnInit, Output, EventEmitter  } from '@angular/core';

@Component({
  selector: 'stripehiv-header',
  templateUrl: './stripehiv-header.component.html',
  styleUrls: ['./stripehiv-header.component.css']
})
export class StripehivHeaderComponent implements OnInit {
    title = 'Stripe HIV App';
    @Output() public sidenavToggle = new EventEmitter();
    constructor() { }

    ngOnInit() {

    }

    public onToggleSidenav = () => {
        this.sidenavToggle.emit();
    }

}
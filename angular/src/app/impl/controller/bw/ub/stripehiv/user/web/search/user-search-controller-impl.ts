import { Injectable, Injector } from '@angular/core';
import { UserSearchController } from 'src/app/gen/controller/bw/ub/stripehiv/user/web/search/user-search-controller';


@Injectable()
export class UserSearchControllerImpl extends UserSearchController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public  doInitialiseSearchScreen(form): void {
	}

	public  doUserSearch(): void {
	}

	public  doEditUser(form): void {
	}

}

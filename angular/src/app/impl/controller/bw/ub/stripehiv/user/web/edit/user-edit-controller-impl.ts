import { Injectable, Injector } from '@angular/core';
import { UserEditController } from 'src/app/gen/controller/bw/ub/stripehiv/user/web/edit/user-edit-controller';


@Injectable()
export class UserEditControllerImpl extends UserEditController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public  doInitialiseEditScreen(form): void {
	}

	public  doNewUser(): void {
	}

	public  doSaveUser(): void {
	}

}

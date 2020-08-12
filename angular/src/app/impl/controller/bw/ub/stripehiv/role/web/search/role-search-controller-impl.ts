import { Injectable, Injector } from '@angular/core';
import { RoleSearchController } from 'src/app/gen/controller/bw/ub/stripehiv/role/web/search/role-search-controller';


@Injectable()
export class RoleSearchControllerImpl extends RoleSearchController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public  doInitialiseSearchScreen(form): void {
	}

	public  doRoleSearch(): void {
	}

	public  doEditRole(form): void {
	}

}

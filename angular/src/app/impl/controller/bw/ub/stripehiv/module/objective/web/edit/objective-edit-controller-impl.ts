import { Injectable, Injector } from '@angular/core';
import { ObjectiveEditController } from 'src/app/gen/controller/bw/ub/stripehiv/module/objective/web/edit/objective-edit-controller';


@Injectable()
export class ObjectiveEditControllerImpl extends ObjectiveEditController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public  doInitialiseEditScreen(form): void {
	}

	public  doNewObjective(): void {
	}

	public  doSaveObjective(): void {
		//this.objectiveService.saveObjective()
	}

}

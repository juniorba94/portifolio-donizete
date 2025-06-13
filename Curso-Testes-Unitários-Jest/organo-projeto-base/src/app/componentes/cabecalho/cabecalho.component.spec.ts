import { CabecalhoComponent } from "./cabecalho.component"
import {TestBed} from "@angular/core/testing";
describe('CabecalhoComponent', () => {
    let component: CabecalhoComponent;

    beforeEach(() => {
        TestBed.configureTestingModule({
            imports: [CabecalhoComponent],
        })
        component = new CabecalhoComponent();
    });

    it('deveria ser criado', () => {
        expect(component).toBeTruthy();
    })


})


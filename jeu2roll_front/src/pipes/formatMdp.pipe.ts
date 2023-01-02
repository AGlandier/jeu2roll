import { Pipe, PipeTransform } from "@angular/core";

@Pipe ({
    name: 'mdp'
})

export class FormatmdpPipe implements PipeTransform {
  transform(value: String): String {
    
    var newVal = new String;

    newVal += value[0];

    for (let i = 1; i < value.length; i++) {
        newVal += '*'; 

    }
    return newVal;
  }
}
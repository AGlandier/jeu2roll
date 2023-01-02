import { Pipe, PipeTransform } from "@angular/core";

@Pipe ({
    name: 'formatDate'
})

export class FormatdatePipe implements PipeTransform {
  transform(value: String): String {
    
    var newVal = new String;
    newVal = value.substring(8,10) + "/" + value.substring(5,7) + "/" + value.substring(0,4)
    return newVal;
  }
}
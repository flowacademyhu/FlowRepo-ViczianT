import { Directive, Renderer2, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appHtmlToColor]'
})
export class HtmlToColorDirective {

  constructor(private elementRef: ElementRef, private renderer: Renderer2) {
    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'pink');
  }

  @HostListener('mouseover')
  onmouseover() {
    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'gray');
  }

  @HostListener('mouseout')
  onmouseout() {
    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'pink');
  }

}

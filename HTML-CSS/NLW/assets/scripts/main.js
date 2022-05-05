function onScroll(){
  if(scrollY > 0){
    navi.classList.add('scroll')
  }
  else{
    navi.classList.remove('scroll')
  }
}
function openMenu(){
  body.classList.add('menu-expanded')
}
function closeMenu(){
  body.classList.remove('menu-expanded')
}
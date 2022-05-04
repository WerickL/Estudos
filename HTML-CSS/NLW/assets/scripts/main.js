function onScroll(){
  if(scrollY > 0){
    navi.classlist.add('scroll')
  }
  else{
    navi.classlist.remove('scroll')
  }
}
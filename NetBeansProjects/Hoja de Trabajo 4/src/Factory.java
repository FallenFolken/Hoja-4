/*
Autor: Kimberly Guzmán      Carnet: 13642 
       Erick Saucedo        Carnet: 13167

Nombre de archivo: Factory.java 
Descripcion: clase Factory que 
*/
class Factory<E> {
    
    public Stack<E> getStack(int entry) {
        switch(entry){
            case 1:
                return new StackArrayList<>();
            case 2:
                return new StackVector<E>();
            case 3:
                return new StackList<E>();
        }
        return null;
   }
    
    public list<E> getList(int entry) {
        switch(entry){
            case 1:
                return new singlyLinkedList<>();
            case 2:
                return new doubleLinkedList<E>();
            case 3:
                return new circular<E>();
        }
        return null;
   }
}
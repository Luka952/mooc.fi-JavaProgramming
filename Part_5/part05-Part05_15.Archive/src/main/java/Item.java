
class Item {
    private String id;
    private String name;
    
    public Item(String identifier, String name){
        this.id=identifier;
        this.name=name;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.id+": "+this.name;
    }
    
    public boolean equals(Object compared){
        Item item=(Item) compared;
        return this.id.equals(item.id);
    }
}

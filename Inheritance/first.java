package inheritance;

public class Dog
{
    protected String name;
// ------------------------------------------------------------
// Constructor -- store name
// ------------------------------------------------------------
    public Dog(String name)
    {
        this.name = name;
    }      
// ------------------------------------------------------------
// Returns the dog's name
// ------------------------------------------------------------
    public String getName()
    {
        return name;
    }
// ------------------------------------------------------------
// Returns a string with the dog's comments
// ------------------------------------------------------------
    public String speak()
    {
        return "Woof";
    }
}

// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever. Overrides Dog speak method and includes
// information about avg weight for this breed.
//
// ****************************************************************
public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    private int breedWeight = 75;
    public Labrador(String name, String color)
    {
    this.color = color;
    }
    // ------------------------------------------------------------
    // Big bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    public String speak()
    {
        return "WOOF";
    }
    // ------------------------------------------------------------
    // Returns weight
    // ------------------------------------------------------------
    public static int avgBreedWeight()
    {
        return breedWeight;
    }
}
public class Yorkshire extends Dog
{
    public Yorkshire(String name)
    {
        super(name);
    }
    // ------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    public String speak()
    {
        return "woof";
    }
}
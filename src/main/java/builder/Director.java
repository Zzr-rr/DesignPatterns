package builder;

public class Director {
    public Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){
        builder.buildPart1("part1");
        builder.buildPart2("part2");
    }
}
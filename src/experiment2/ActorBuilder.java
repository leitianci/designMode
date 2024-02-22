package experiment2;

public abstract class ActorBuilder {
    Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildskill();

    public Actor createActor(){
        return actor;
    }
}

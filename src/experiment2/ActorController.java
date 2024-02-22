package experiment2;

public class ActorController {
    public Actor contruct(ActorBuilder ab){
        Actor actor ;
        ab.buildType();
        ab.buildSex();
        ab.buildskill();
        actor = ab.createActor();
        return actor;
    }
}

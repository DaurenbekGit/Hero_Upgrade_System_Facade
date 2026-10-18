package kz.assignment.Subsystem;

import kz.assignment.Component.Hero;
import kz.assignment.Component.PhantomLance;
import kz.assignment.Component.Techies;
import kz.assignment.Component.Tinker;

public class HeroManager {

    public Hero createHero(String name){
        if (name == null){
            throw new IllegalArgumentException("Hero name cannot be null");
        }

        switch (name.toLowerCase()){

            case "phantomlance":
                return new PhantomLance();

            case "techies":
                return new Techies();

            case "tinker":
                return new Tinker();

            default:
                throw new IllegalArgumentException("Unknown hero: " + name);
        }
    }
}
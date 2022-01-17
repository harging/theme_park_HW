import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions = new ArrayList<>();
    private ArrayList<Stall> stalls = new ArrayList<>();
    private Visitor visitor;
    private Attraction attraction;

    public ThemePark(ArrayList attractions, ArrayList stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void setStalls(ArrayList<Stall> stalls) {
        this.stalls = stalls;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewList = new ArrayList<>();
        for (IReviewed reviewed: stalls) {
            reviewList.add(reviewed);
        }
        return reviewList;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addVisitedAttractions(attraction);
        attraction.addVisitCount();
    }
}

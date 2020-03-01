package test.sample.backwardChain.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.sample.backwardChain.drools.models.Location;
import test.sample.backwardChain.drools.models.ResponseMessage;
import test.sample.backwardChain.drools.service.LocationService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LocationController {

    private final LocationService locationService;
    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }
    @RequestMapping(value = "/getLocation", method = RequestMethod.GET, produces = "application/json")
    public ResponseMessage getLocation() {
        List<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Raj", "GDS"));
        locations.add(new Location("GDS", "EY"));
        //locations.add(new Location("EY", "Bangalore"));
        locations.add(new Location("Bangalore", "India"));
        locationService.getLocationService(locations);


        return new ResponseMessage("200", "Operation Successful");
    }
}

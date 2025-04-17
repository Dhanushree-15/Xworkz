package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class ProjectorImpl implements IProjector {
    public void projectImage() { System.out.println("ProjectorImpl - projectImage"); }
    public void adjustFocus() { System.out.println("ProjectorImpl - adjustFocus"); }
    public void shutDown() { System.out.println("ProjectorImpl - shutDown"); }
}

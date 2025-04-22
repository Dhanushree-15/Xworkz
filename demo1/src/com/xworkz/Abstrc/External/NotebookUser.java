package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Notebook;

public class NotebookUser {
    private Notebook device;

    public NotebookUser(Notebook device) {
        this.device = device;
        System.out.println("Initializing NotebookUser with Notebook");
    }

    public void writeNote() {
        System.out.println("Using the Notebook");
        if (this.device != null) {
            this.device.writeNote();
        } else {
            System.err.println("Notebook is not available");
        }
    }
}

package com.orbitrondev.Abstract;

import com.orbitrondev.Controller.ServiceLocator;

/**
 * Copyright 2015, FHNW, Prof. Dr. Brad Richards. All rights reserved. This code
 * is licensed under the terms of the BSD 3-clause license (see the file
 * license.txt).
 * 
 * @author Brad Richards
 */
public abstract class Model {
    protected ServiceLocator serviceLocator;

    protected Model() {
        serviceLocator = ServiceLocator.getServiceLocator();
    }
}

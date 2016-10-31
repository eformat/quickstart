/*
 * JBoss, Home of Professional Open Source
 * Copyright 2016, Red Hat, Inc., and others contributors as indicated
 * by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */

package com.jboss.jbosstm.xts.demo.restaurant;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-hudson-182-RC1
 * Generated source version: 2.0
 * 
 */
@WebService(name = "IRestaurantServiceBA", targetNamespace = "http://www.jboss.com/jbosstm/xts/demo/Restaurant")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IRestaurantServiceBA {


    /**
     * 
     * @param howMany
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "bookSeatsBAResponse", partName = "bookSeatsBAResponse")
    public boolean bookSeats(
        @WebParam(name = "how_many", partName = "how_many")
        int howMany);

}

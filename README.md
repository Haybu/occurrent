# Occurrent

[![Build Status](https://travis-ci.com/johanhaleby/occurrent.svg?branch=master)](https://travis-ci.com/johanhaleby/occurrent)

Experimental Event Sourcing Utilities based on the [cloud events](https://cloudevents.io/) specification. 

Work in progress, don't use in production just yet :)

#### Design Choices

Occurrent is designed to be [simple](https://www.infoq.com/presentations/Simple-Made-Easy/), non-intrusive and pragmatic.
 
* You should be able to design your domain model without _any_ dependencies to Occurrent or any library. Use Occurrent to store your events generated by the domain model.
* Simple: Pick only the libraries you need, no need for an all or nothing solution.
* You should be in control! Magic is kept to a minimum and data is stored in a standard format ([cloud events](https://cloudevents.io/)). You are responsible for serializing/deserializing the cloud events "body" (data) yourself.
* Composable: Function composition and pipes are encouraged. For example pipe the event stream to a rehydration function (any function that converts a stream of events to current state) before calling your domain model.
* Designed to be used as a library and not framework to the greatest extent possible.
* Pragmatic: Need consistent projections? You can decide to write projections and events transactionally using tools you already know (such as Spring `@Transactional`)! 
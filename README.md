# The AppCivist Project 

**AppCivist ([www.appcivist.org](www.appcivist.org))** is a software platform for democratic assembly and collective action that lets users design their own participatory processes, with modular components, to organize democratic action. The project  is a collaboration between the [Social Apps Lab @ CITRIS](http://citris-uc.org/initiatives/social-apps-lab/) at the University of California, Berkeley and [Inria@Silicon Valley](https://project.inria.fr/siliconvalley/). 

The platform is composed by 4 components, described below. To learn more about each, read the [Project Documentation](#project-documentation) below.:

* [AppCivist Core Platform](https://github.com/socialappslab/appcivist-platform/): this repository contains the source code of the core backend for AppCivist. The core platform provides a RESTful API for managing User authentication, Assembly and Contribution Making. 
* [AppCivist-PB UI](https://github.com/socialappslab/appcivist-pb-client): main User Interface of the AppCivist Project for civic engagement proccesses like participatorty budgeting or planning.
* [AppCivist Voting API](https://github.com/socialappslab/appcivist-voting-api): prototype implementation of a Ballot Based Voting API that allows both registered and non-registered users to cast votes on AppCivist users contributions. 
* [AppCivist Notification Service](https://github.com/socialappslab/appcivist-voting-api): prototype implementation of notification service running over RabbitMQ. 

Altogether, the **AppCivist-PB prototype UI** connects to both to the **AppCivist Core Platform** and the **AppCivist Voting API** to provide a full experience of configurable assembly making.

To start playing with the platform, read the [Getting Started with the AppCivist Guide](https://github.com/socialappslab/appcivist-platform/docs/getting-started.md), download the source code, install the platform and run it

![AppCivist alpha prototype simplified architecture](docs/images/Prototype Implementation Architecture.png)  

## Project Documentation

1. **AppCivist Technical Documentation and Development Guide** ([github](docs/architecture.md)) explains how to contribute to the project development, starting from the appcivist core platform.
2.  **AppCivist API Docs** include the API documentation for the two main APIs in use by the AppCivist UI: 
    * **[API Docs for the AppCivist Core Platform](https://platform.appcivist.org/api/doc)**
    * **[API Docs for the AppCivist Voting API](https://platform.appcivist.org/voting/docs/api/v0.html)**
3. **AppCivist Core Definitions** ([gdoc](https://docs.google.com/document/d/1mgT9ac9c6bvhGMZ7_IHLYAAgwHxr06gK57RC1BI8gPQ/edit?usp=sharing)) offers an overview of the key concepts we use in our platform. 
4. **AppCivist Conceptual Architecture Documentation** ([gdoc](https://docs.google.com/document/d/1K0aceRhEYoW04D9CjM9g3LbQYuDKXD08yLLPkuhZJQ8/edit?usp=sharing)) is a conceptual description of the architecture, detailing the ideal components we have envisioned. 
5. **AppCivist-PB User’s Guide** ([gdoc](https://docs.google.com/document/d/1a2jmVKqtZSM2VRxTMImRFGbjsgRQpFXl7RHHjW1022U/edit?usp=sharing)) is a simple, screen-based, user guide of the current user interface prototype that supports proposal and decision making activities for participatory budgeting. 
6. **AppCivist 2-pages Product Pitch** ([gdoc](https://docs.google.com/document/d/14n4_EF36vXYfiA6FVPbrbzWyhadA08t6wV1bkEYJw3o/edit?usp=sharing)) gives a quick overview of the project and its main ideas as a quick 1-page product pitch.  

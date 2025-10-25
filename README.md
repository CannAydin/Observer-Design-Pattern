Observer Design Pattern & Spring ApplicationEventPublisher

In this project, I tested the Observer Design Pattern using Spring’s ApplicationEventPublisher.
I compared the two different ways of publishing events in Spring:

Before Spring 4.2:
Events had to extend the ApplicationEvent class.
For example, I created a custom event class called OrderCreatedEvent for email notifications and published it with
ApplicationEventPublisher.publishEvent(ApplicationEvent event).

Since Spring 4.2:
The method publishEvent(Object event) was added.
This allows publishing any POJO (Plain Old Java Object) directly as an event.
I used this new approach for SMS notifications — I just published an OrderDTO object without creating a custom event class.

In summary:

Old style → needs a custom class extending ApplicationEvent.

New style → you can directly publish any object. Spring automatically wraps it in a PayloadApplicationEvent<T>.

Both methods use the same ApplicationEventPublisher interface — the difference is just in flexibility.

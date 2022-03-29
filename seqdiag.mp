@startuml
actor Customer as Foo1
participant CreditPaymentCompant as Foo2
participant InsuranceProvider as Foo3
participant Website as Foo4
Activate Foo1
Activate Foo4
Foo1-> Foo4 : searchVehicles() 
Foo1 -> Foo4 : reserveVehicles() 
Foo1 -> Foo4 : inputInsuranceInfo() 
Foo4 -> Foo3 : requestInfo()
Activate Foo3
Foo3 -> Foo4 : isValid()
Deactivate Foo3
Foo1 -> Foo4 : inputPayment() 
Foo4 -> Foo2 : requestPaymentInfo()
Activate Foo2
Foo2 -> Foo4 : isPaymentValid()
Deactivate Foo2
Foo4 -> Foo1 : pickupInfo()
Deactivate Foo4
Deactivate Foo1
@enduml

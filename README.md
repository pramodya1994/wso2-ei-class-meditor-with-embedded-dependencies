# WSO2 EI Class mediator with Embedded Dependencies

- Build the project using following command.
```bash
mvn clean install
```

- Add `ExtDependencyProject-1.0-SNAPSHOT.jar` to the `<EI_HOME>/dropins` directory and restart the integrator.

- Deploy the following proxy.
```xml
<?xml version="1.0" encoding="UTF-8"?>
<proxy name="HelloWorld" startOnLoad="true" transports="http https" xmlns="http://ws.apache.org/ns/synapse">
    <target>
        <inSequence>
            <class name="com.sample.ExtDep"/>
            <payloadFactory media-type="json">
                <format>{"Hello":"World"}</format>
                <args/>
            </payloadFactory>
            <respond/>
        </inSequence>
        <outSequence/>
        <faultSequence/>
    </target>
</proxy>
```

- Invoke the proxy using following curl command.
```bash
curl http://localhost:8280/services/HelloWorld
```

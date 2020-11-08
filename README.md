# ecommerce
 eCommerce site Angular + Spring
 
 
 ## Troubleshooting
 In application.properties, setting "spring.datasource.name" does not allow local connection to the DB. 
 
 **Fix** was found online: Set spring.datasource.url=jdbc:h2:mem:testdb then use as jdbc url in the h2-console.

# gdsn-lib
This project was created to generate Java classes from XSD files located on the GS1 website.
https://gs1.se/en/guides/documentation/

To create a new GS1 release you must:

1. Upgrade the project version in pom.xml 
<gdsn.version>3.1.25</gdsn.version>

2. Change the path to the "Catalogue Item Synchronization Schema" of the new release in pom.xml <catalogueItem.version>June2023</catalogueItem.version>
3. Create a new project branch named release-3.1.25 and commit out the changes in it
4. Create a pull request in GitHub dev <- release-3.1.25 and merge 
5. Once the pipeline is complete, review the changes and make corrections if necessary
6. Create a pull request in GitHub master <- dev and merge 

After the merge dev <- release-3.1.25, the pipeline is launched, which uploads the 3.1.25.0-SNAPSHOT artifact to the repository.

After the master <- dev merge, the pipeline is launched, which uploads the 3.1.25.0 artifact to the repository.
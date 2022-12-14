# CHANGELOG

All notable changes to this project will be documented in this file.

# V1 (1.0)

- feat: add README.md
- feat: add gitignore
- feat: initial boilerplate
- feat: enable view binding
- feat: updated main ui
- added product card ui
- added product card adapter and it's functionality
- feat: using the view state to populate the item in the recycler view
- feat: add CHANGELOG.md
- feat: update README.md
- feat: add product list view state
- feat: remove hard coded view state from the adapter and put it in the activity for now
- feat: hard coding the data in the activity for now
  the right way to do it is to use view models which we will implement later insha allah
- BREAKING CHANGE: cover view state which help a lot to build UIs
  they are responsive and they are always consistent in between states
- chore(deps): add dependencies for the view model and the live data
- chore(deps): bump core-ktx from 1.7.0 to 1.9.0
- chore(sdk): update targetSdkVersion from 32 to 33
- chore(sdk): set compileSdkVersion from 32 to 33
- docs: update changelog
- feat: add a view model for our product list
- feat: the fragment is using live data to access the view states
- BREAKING CHANGE: cover the lifecycle artifacts including view model and live data later, we will
  cover asynchronous operations and coroutines, in-sha-Allah.
- docs: update changelog with recent changes
- docs: update readme file
- docs: add progress summary on readme
- feat: add product repository
- feat: implement coroutines with mock data
- fix: product list mock data not showing issue
- docs: update readme file
- docs: update changelog
- chore: add necessary dependencies for http client
- docs: update progress summary on readme file
- feat: add product service class to fetch the list of products
- feat: add product entity class to represent the product which is going to be used by the
  repository layer and the view state is going to use by the view layer, the ui layer
- feat: add a new api client which is going to be responsible for returning the client that we need
  to actually do the requests
- feat: add retrofit builder which will be responsible for creating an implementation for our
  service
- feat: get a reference to our client on product repository instead of returning mock data
- feat: map the product entity into a product card view state to resolve the error on product
  repository
- refactor: reformat the product card view state data class
- docs: update changelog with recent changes
- docs: update the progress summary in the readme file
- 
- chore: add the necessary dependencies for the glide module
- feat: add new parameter imageUrl for ProductCardViewState data class
- feat: update ProductCardViewState mapping on ProductRepository
- feat: showing product image via glide on ProductCardListAdapter
- fix: resolve missing @Url parameter for method ProductService.getProductList
- feat: add necessary uses-permissions into the manifest
- feat: update the price value on product repository mapping
- docs: update changelog with recent changes
- 
- docs: update the progress summary in the readme file
- fix: create an interface & make sure that our view model is using interface rather than concrete
  class to comply with the DIP of SOLID principles
- feat: implements an interface on ProductRepositoryAPI class and override the method
- feat: instead of relying in the concrete class, i relying the interface in our view model
- feat: view model is depending on abstraction instead of concretions
- feat: view model is depending in interface which is implemented by ProductRepositoryAPI
- docs: update changelog with recent changes
- 
- docs: update the progress summary in the readme file
- chore: import hilt dependencies which provides a standard way to incorporate Dagger dependency
  injection into an Android application
- feat: add new AppApplication class and implement the application class on it, basically the
  application is going to be used to tell hilt to start generating code for us
- feat: instead of creating the dependency inside of the class, are pass as a constructor according
  to the dependency injection principles
- feat: add new RepositoryModule class where hilt provide dependencies for us
- fix: used another annotation called @InstallIn to define the visibility or the scope for those
  dependencies where those dependencies going to be available
- feat: use SingletonComponent as we want all those dependencies to be a singleton because we don't
  need more than one instance of those
- feat: to make sure that those dependencies can be crated by hilt, we have use another annotation
  called inject. we have also have to use a constructor
- feat: use @HiltViewModel annotations for the view models
- feat: use our application in our android manifest otherwise our application won't work
- feat: ApiClient services use as companion object
- docs: update changelog with recent changes


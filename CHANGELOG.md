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
-
- docs: update the progress summary in the readme file
- chore(gradle): add kotlin extensions for 'fragment' artifact
- chore(gradle): add kotlin extensions for 'Navigation Component' artifact
- chore(gradle): add kotlin extensions for Android Navigation Fragment Hilt Extension
- feat: add new product list module
- BREAKING CHANGE: add new module product list
-
- docs: update the progress summary in the readme file
- feat: add nav_graph under navigation
- feat: add FragmentContainerView on main activity layout
- feat: update main activity codebase
- feat: add new layout for product details
- feat: binding the view of product details
- feat: set dummy data on product details
- feat: add productDetailsFragment under navigation
- feat: add navigation startDestination
- feat: add a new action of productListFragment and its destination under navigation
- feat: use Safe Args to navigate with type-safety
- fix: change the configuration name to 'kapt' for glide artifacts as 'annotationProcessor'
  dependencies won't be recognized as kapt annotation processors
- feat: add onItemClicked functionality on the ProductListFragment
- feat: make ViewHolder as inner class & register a callback to be invoked when itemView is clicked
- fix: crash issue for missing the Android entry point on the MainActivity
- chore(gradle): add alternative lifecycle-common-java8 artifacts for lifecycle-compiler
- feat: update the dummy image url on the product details
- BREAKING CHANGE: add new module product details
- feat: update .gitignore
- docs: update changelog with recent changes
- feat: update strings
-
- docs: update the progress summary in the README file
- Chore: Upgrade AGP dependency from 7.3.1 to 7.4.0, Gradle version to 7.5
- BREAKING CHANGE: upgrade the Android Gradle Plugin to take advantage of latest features,
  improvements, and security fixes
- feat: update .gitignore and package namespace
- refactor(data): move ProductEntity to data layer within "product_list" feature for improved
  organization and maintainability
- refactor(business): move ProductCardViewState to business layer in "product_list" feature for
  better organization and maintainability
- refactor(presentation): move ProductListViewModel, ProductListFragment, ProductCardListAdapter,
  ProductListViewState, and ProductCardViewState to presentation layer in "product_list" feature for
  better organization and maintainability
- feat(business): add new data class Product under business layer of "product_list" feature
- refactor(repository): replace ProductCardViewState by Product on ProductRepository and
  ProductRepositoryAPI
- feat(view-model): map productList to support ProductCardViewState on ProductListViewModel and
  enhance to support it through mapping of productList
- doc: update CHANGELOG.md
-
- feat(ProductDetails): move ProductDetailsFragment to presentation layer for better organization
  and maintainability
- feat(ProductDetails): add ProductDetails data class under business layer
- feat(ProductDetails): add ProductDetailsEntity data class under data layer
- feat(ProductDetails): add ProductDetailsViewState class under presentation layer
- feat(ProductDetails): add ProductDetailsViewModel class under presentation layer
- feat(ProductRepository): create abstract getProductDetails suspend function
- fix: resolve type mismatch on ProductDetailsViewState
- feat(ProductService): add getProductDetails service
- feat(ProductRepositoryAPI): add getProductDetails function to retrieve ProductDetails
- feat(fragment_product_details): add ProgressBar to display loading view
- feat(ProductDetailsFragment): implement observable pattern to update UI
- fix(imports): optimize imports to resolve Unresolved reference: ProductListFragmentDirections
-
- chore(structure): move ProductRepository to repository under data layer of shared feature for
  better organization and maintainability
- chore(structure): move ApiClient to api directory under repository of data layer for better
  organization and maintainability
- chore(structure): move ProductRepositoryAPI to api directory under repository of data layer for
  better organization and maintainability
- chore(structure): move ProductService to api directory under repository of data layer for better
  organization and maintainability and refactor related classes
- chore(structure): move MainActivity to presentation layer under shared feature, refactor related
  classes and dependencies imports for better organization and maintainability
-
- chore(build): upgrade AGP dependency from 7.4.0 to 7.4.1 and sync project successfully

  This commit updates the Android Gradle Plugin dependency from 7.4.0 to 7.4.1 to take advantage of
  the latest features, improvements, and security fixes. The upgrade steps have been successfully
  executed, and the project has been synced with the IDE.
-
- docs: update README.md
-
- feat(wishlist): modify product list item to include wishlist feature
- feat(ProductCardViewState): Add "isFavorite" field to track product status in the productList
- feat(ProductCardListAdapter): implement update of favorite icon based on the ProductCardViewState
- fix: the places where the ProductCardViewState was being used
-

[//]: # (- feat&#40;wishlist&#41;: add the WishListRepository as the way that we communicate from the view model to)

[//]: # (  access data is by using a repository. According to the dependency inversion principle, our view)

[//]: # (  model should rely on an interface, on an abstraction rather than a concretion.)

- feat(WishListRepository): implement the WishListRepository as a means of communication between the
  view model and the data access layer. Adhere to the dependency inversion principle by relying on
  an interface instead of a concrete implementation.

[//]: # (- feat: add a new class WishlistDatabaseRepository to implement of the WishListRepository interface)

[//]: # (- feat: use WishlistRepository to the ProductListViewModel)

[//]: # (- feat: when creating the view state instead of passing static boolean now passing the wishlist)

[//]: # (  repository)

[//]: # (- feat: add productId to our product_list domain)

[//]: # (- feat: add productId to our repository api)

[//]: # (- feat: add productId on the ProductEntity as this is the object that is actually mapping the JSON response and retrofit is using it)

- feat: add implementation of WishListRepository to WishlistDatabaseRepository
- feat: inject WishlistRepository via constructor in ProductListViewModel
- feat: update view state creation in ProductListViewModel to use WishlistRepository

[//]: # (- feat: use WishlistRepository in ProductListViewModel)

[//]: # (- feat: pass wishlist repository to create view state)

- feat: add productId field to product_list domain layer
- feat: add productId field to shared repository API layer
- fix: include productId in ProductEntity for proper JSON mapping by Retrofit
- chore(repo): provide WishlistRepository to RepositoryModule
- refactor: rename the WishlistRepository

- feat(wishlist): add presentation and domain layer

- BREAKING CHANGE: This commit modifies the wishlist boilerplate by adding the presentation and
  domain layer. The presentation layer has been implemented with the addition of the wishlist icon
  in the adapter with functionality. The view model has also been updated to change the view state
  and describe the UI. The view state will now include information on whether a product is or isn't
  in the wishlist, which is obtained from the wishlist repository.

- docs: update CHANGELOG with recent commits

rewrite this commit according to the conventional commits standard:

- feat: Resolve crash issue in product list click event

This commit addresses a crash issue that occurs when navigating from the product list to the product
details page. The fix ensures a smooth transition without any crashes.

- feat(build): upgrade Android Gradle Plugin to 7.4.2

The Android Gradle Plugin (AGP) version in the project has been updated from 7.4.1 to 7.4.2 to take
advantage of the latest features, improvements, and security fixes.

- refactor: update .gitignore file

- feat: add the apollo plugin to our project level build.gradle file
- feat: add the apollo runtime dependency on app level build.gradle file
- feat: add apollo service dependency on app level build.gradle file
- feat: add the schema.json file

# Be sure to restart your server when you modify this file.

# Your secret key for verifying cookie session data integrity.
# If you change this key, all old sessions will become invalid!
# Make sure the secret is at least 30 characters and all random, 
# no regular words or you'll be exposed to dictionary attacks.
ActionController::Base.session = {
  :key         => '_rTasks_session',
  :secret      => 'c8e855eeca38060ba64a006a709f3ea367dfd6aa3016c50c463d905af233954a77f13d2b5134c3d685f45c2fca1855e11c6bd948cd02a52c5e2f62d0619143e2'
}

# Use the database for sessions instead of the cookie-based default,
# which shouldn't be used to store highly confidential information
# (create the session table with "rake db:sessions:create")
# ActionController::Base.session_store = :active_record_store
